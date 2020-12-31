import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Matrix.ScaleToFit;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_appsfarmer_FazaileAmaalVol2_1552623895 {
   @Test
   public void testCase() throws Exception {
      Matrix var4 = new Matrix();
      Object var1 = EasyMock.createMock(RectF.class);
      Object var2 = EasyMock.createMock(RectF.class);
      Object var3 = EasyMock.createMock(ScaleToFit.class);
      var4.setRectToRect((RectF)var1, (RectF)var2, (ScaleToFit)var3);
   }
}
