import android.location.Geocoder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_aci_itim_trauma__1046917709 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Geocoder.class);
      String var1 = "android";
      ((Geocoder)var2).getFromLocationName(var1, 1, -47.481645D, 111.598005D, -10.889686D, 179.901944D);
   }
}
