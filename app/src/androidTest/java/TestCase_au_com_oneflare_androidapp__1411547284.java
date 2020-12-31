import android.app.Activity;
import android.app.ActivityOptions;
import android.util.Pair;
import android.util.Pair;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_oneflare_androidapp__1411547284 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Activity.class);
      Object var1 = EasyMock.createMock(Pair[].class);
      ActivityOptions.makeSceneTransitionAnimation((Activity)var0, (Pair[])var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
