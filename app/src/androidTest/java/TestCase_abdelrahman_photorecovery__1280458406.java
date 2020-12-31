import android.content.res.AssetManager;
import android.graphics.Typeface;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery__1280458406 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(AssetManager.class);
      Typeface var1 = Typeface.createFromAsset((AssetManager)var0, "ksr.ttf");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
