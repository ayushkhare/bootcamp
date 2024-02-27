package org.sephora.checkpoint.three;

public interface IStack<Integer> {

    public boolean isEmpty();

    public int peek();

    public IStack<Integer> push(int number);

    public IStack<Integer> pop();
}
