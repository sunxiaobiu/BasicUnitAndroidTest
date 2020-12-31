import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_wifianalyzerpro_1648564202 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Canvas.class);
      Object var1 = EasyMock.createMock(Path.class);
      Object var2 = EasyMock.createMock(Paint.class);
      ((Canvas)var3).drawPath((Path)var1, (Paint)var2);
   }
}
