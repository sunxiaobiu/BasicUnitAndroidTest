import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.widget.ImageView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_fiistudio_fiinote__1308213792 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ImageView.class);
      Drawable var3 = ((ImageView)var2).getDrawable();
      NinePatchDrawable var4 = (NinePatchDrawable)var3;
      byte var1 = 1;
      var4.setTargetDensity(var1);
   }
}
