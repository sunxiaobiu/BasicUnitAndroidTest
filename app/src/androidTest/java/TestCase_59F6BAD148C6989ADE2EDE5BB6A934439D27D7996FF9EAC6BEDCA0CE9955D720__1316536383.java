import android.system.Os;
import androidx.test.runner.AndroidJUnit4;
import java.io.FileDescriptor;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59F6BAD148C6989ADE2EDE5BB6A934439D27D7996FF9EAC6BEDCA0CE9955D720__1316536383 {
   public static void testCase() throws Exception {
      Object var0 = null;
      long var1 = 1L;
      Os.posix_fallocate((FileDescriptor)var0, 0L, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
