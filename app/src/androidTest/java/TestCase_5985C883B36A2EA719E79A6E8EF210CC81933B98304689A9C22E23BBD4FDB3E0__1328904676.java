import android.content.Context;
import android.media.SoundPool;
import android.media.SoundPool.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5985C883B36A2EA719E79A6E8EF210CC81933B98304689A9C22E23BBD4FDB3E0__1328904676 {
   @Test
   public void testCase() throws Exception {
      SoundPool var3 = new SoundPool(1, 3, 0);
      Builder var4 = new Builder();
      var3 = var4.build();
      byte var1 = 1;
      Object var2 = EasyMock.createMock(Context.class);
      var3.load((Context)var2, var1, 1);
   }
}
