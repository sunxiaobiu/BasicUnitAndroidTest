import android.media.SoundPool;
import android.media.SoundPool.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5985C883B36A2EA719E79A6E8EF210CC81933B98304689A9C22E23BBD4FDB3E0_1433860967 {
   @Test
   public void testCase() throws Exception {
      SoundPool var1 = new SoundPool(1, 3, 0);
      SoundPool var2 = var1;
      Builder var3 = new Builder();
      var1 = var3.build();
      byte var4 = 1;
      var2.play(var4, 1.0F, 1.0F, 1, 0, 1.0F);
   }
}
