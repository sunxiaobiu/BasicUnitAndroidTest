import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bayyinah_tv_861320043 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(NinePatchDrawable.class);
      Object var1 = EasyMock.createMock(Rect.class);
      ((NinePatchDrawable)var2).getPadding((Rect)var1);
   }
}
