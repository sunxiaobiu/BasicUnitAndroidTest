import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_biz_app4mobile_app_1a20c816265545309256f8298cc273d3_app__1394506870 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Camera.class);
      Parameters var3 = ((Camera)var2).getParameters();
      String var1 = "android";
      var3.setColorEffect(var1);
   }
}
