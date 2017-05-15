/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.npaint;

import java.util.Stack;

/**
 *
 * @author Huu Phuoc
 * @param <E>
 */
public class UndoRedoManager<E> {

    private E value;
    private final Stack<E> undoStack;
    private final Stack<E> redoStack;

    public UndoRedoManager(E value) {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
        this.value = value;
    }

    public E set(E value) {
        undoStack.push(value);
        this.value = value;
        this.redoStack.clear();
        return this.value;
    }

    public E get() {
        return this.value;
    }

    public boolean canUndo() {
        return !undoStack.isEmpty();
    }

    public E undo() {
        if (!canUndo()) {
            throw new IllegalStateException();
        }
        redoStack.push(this.value);
        this.value = undoStack.pop();
        System.out.println("Undo: ");
        System.out.println("\tredo size " + redoStack.size());
        System.out.println("\tundo size " + undoStack.size());
        return this.value;
    }

    public boolean canRedo() {
        return !redoStack.isEmpty();
    }

    public E redo() {
        if (!canRedo()) {
            throw new IllegalStateException();
        }
        undoStack.push(this.value);
        this.value = redoStack.pop();
        System.out.println("Redo: ");
        System.out.println("\tredo size " + redoStack.size());
        System.out.println("\tundo size " + undoStack.size());
        return this.value;
    }
}
