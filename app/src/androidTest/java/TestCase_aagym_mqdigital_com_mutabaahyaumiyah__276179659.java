import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aagym_mqdigital_com_mutabaahyaumiyah__276179659 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ImageView.class);
      Drawable var2 = ((ImageView)var1).getDrawable();
      Animatable var3 = (Animatable)var2;
      var3.start();
   }
}
