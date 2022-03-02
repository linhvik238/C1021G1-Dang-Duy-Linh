package lesson23_BehavioralDesignPattern.practice;

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
