import android.content.IntentFilter;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_gesundheitstipp_mipade_311316659 {
   public static void testCase() throws Exception {
      IntentFilter var0 = IntentFilter.create("close the app", "content://mipade");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
