import android.media.SoundPool;
import android.media.SoundPool.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A24371FF1858506C916E4C66F36A6F1523DE7454651C763811A3AF9F8229FF7__1465261778 {
   @Test
   public void testCase() throws Exception {
      Builder var2 = new Builder();
      SoundPool var3 = var2.build();
      var3 = new SoundPool(5, 3, 0);
      String var1 = "android";
      var3.load(var1, 0);
   }
}
