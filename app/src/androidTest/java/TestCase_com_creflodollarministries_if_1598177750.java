import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_creflodollarministries_if_1598177750 {
   @Test
   public void testCase() throws Exception {
      OvalShape var2 = new OvalShape();
      ShapeDrawable var3 = new ShapeDrawable();
      Object var1 = EasyMock.createMock(LightingColorFilter.class);
      var3.setColorFilter((ColorFilter)var1);
   }
}
