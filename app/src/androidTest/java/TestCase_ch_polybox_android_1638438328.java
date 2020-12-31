import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_polybox_android_1638438328 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Resources.class);
      Object var1 = EasyMock.createMock(Bitmap.class);
      RoundedBitmapDrawableFactory.create((Resources)var0, (Bitmap)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
