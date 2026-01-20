package com.daromi.xjc.counter;

public interface ConcurrentCounter {
  void increment();

  int get();
}
