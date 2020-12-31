import android.graphics.Canvas;
import android.support.graphics.drawable.VectorDrawableCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airmap_airmap__1710074918 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(VectorDrawableCompat.class);
      Object var1 = EasyMock.createMock(Canvas.class);
      ((VectorDrawableCompat)var2).draw((Canvas)var1);
   }
}
