import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_clinicapp_app__1607413276 {
   @Test
   public void testCase() throws Exception {
      Camera var2 = Camera.open();
      byte var3 = 0;
      var2 = Camera.open(var3);
      Parameters var4 = var2.getParameters();
      List var5 = var4.getSupportedPictureSizes();
      Iterator var6 = var5.iterator();
      Object var7 = var6.next();
      Size var8 = (Size)var7;
      Object var1 = EasyMock.createMock(Size.class);
      var8.equals(var1);
   }
}
