package sqlLesson1.warmup;

import java.util.function.IntConsumer;

public class CountingValley {

  static class State {
    int level = 0;
    int prev = 0;
    int count = 0;
  }

  static int countingValleys(int n, String s) {
    State st = new State();

    IntConsumer process = c -> {
      switch (c) {
        case 'D': st.prev=st.level; st.level--; break;
        case 'U': st.prev=st.level; st.level++; break;
        default : throw new RuntimeException("should be here ;)");
      }
      if (st.level==0 && st.prev<0) st.count++;
    };

    s.chars().forEach(process);
    return st.count;
  }

}
