import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_polybox_android__844977088 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Bitmap.class);
      Object var1 = EasyMock.createMock(Resources.class);
      RoundedBitmapDrawable var3 = RoundedBitmapDrawableFactory.create((Resources)var1, (Bitmap)var2);
      var3.setCircular(true);
   }
}
