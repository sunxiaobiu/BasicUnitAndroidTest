import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_agrisausejs_spinly__1167167221 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Resources var3 = var2.getResources();
      Drawable var4 = var3.getDrawable(2130837639);
      NinePatchDrawable var5 = (NinePatchDrawable)var4;
      Object var1 = EasyMock.createMock(Canvas.class);
      var5.draw((Canvas)var1);
   }
}
