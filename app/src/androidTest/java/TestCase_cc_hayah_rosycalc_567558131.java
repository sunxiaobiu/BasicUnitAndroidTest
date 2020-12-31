import android.app.Activity;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v4.util.Pair;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cc_hayah_rosycalc_567558131 {
   public static void testCase() throws Exception {
      Object var0 = null;
      Object var1 = EasyMock.createMock(Pair[].class);
      ActivityOptionsCompat.makeSceneTransitionAnimation((Activity)var0, (Pair[])var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
