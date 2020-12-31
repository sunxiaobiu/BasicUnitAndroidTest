import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_webjet_1093588291 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(View.class);
      Drawable var3 = ((View)var2).getBackground();
      ColorDrawable var4 = (ColorDrawable)var3;
      byte var1 = 1;
      var4.setColor(var1);
   }
}
