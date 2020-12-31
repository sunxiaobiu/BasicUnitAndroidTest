import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_ants360_yicamera_international_1501829465 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ImageView.class);
      Drawable var2 = ((ImageView)var1).getDrawable();
      AnimationDrawable var3 = (AnimationDrawable)var2;
      var3.run();
   }
}
