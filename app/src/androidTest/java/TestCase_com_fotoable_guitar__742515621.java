import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Rect;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_fotoable_guitar__742515621 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Resources var4 = var3.getResources();
      Bitmap var1 = BitmapFactory.decodeResource(var4, 2130837639);
      byte[] var2 = var1.getNinePatchChunk();
      NinePatch var5 = new NinePatch(var1, var2, (String)"android");
      Object var6 = EasyMock.createMock(Canvas.class);
      Object var7 = EasyMock.createMock(Rect.class);
      var5.draw((Canvas)var6, (Rect)var7);
   }
}
