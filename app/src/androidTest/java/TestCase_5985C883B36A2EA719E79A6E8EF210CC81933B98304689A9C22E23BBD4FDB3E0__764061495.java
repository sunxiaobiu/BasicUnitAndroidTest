import android.content.ContentResolver;
import android.provider.Settings.Global;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5985C883B36A2EA719E79A6E8EF210CC81933B98304689A9C22E23BBD4FDB3E0__764061495 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ContentResolver.class);
      float var1 = Global.getFloat((ContentResolver)var0, "transition_animation_scale");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
