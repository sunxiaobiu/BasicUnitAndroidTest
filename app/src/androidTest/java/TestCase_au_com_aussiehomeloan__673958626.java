import android.app.Activity;
import android.support.v4.app.ActivityCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_aussiehomeloan__673958626 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Activity.class);
      ActivityCompat.startPostponedEnterTransition((Activity)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
