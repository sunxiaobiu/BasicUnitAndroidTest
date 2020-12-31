import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_spacecowboys_sh_consulting_detective__71842519 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Drawable.class);
      PictureDrawable var2 = (PictureDrawable)var1;
      Picture var3 = var2.getPicture();
   }
}
