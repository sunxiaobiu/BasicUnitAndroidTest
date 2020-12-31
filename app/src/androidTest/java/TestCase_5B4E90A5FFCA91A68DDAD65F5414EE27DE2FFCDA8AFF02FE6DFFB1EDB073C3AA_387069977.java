import android.location.LocationManager;
import android.location.GnssStatus.Callback;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5B4E90A5FFCA91A68DDAD65F5414EE27DE2FFCDA8AFF02FE6DFFB1EDB073C3AA_387069977 {
   @Test
   public void testCase() throws Exception {
      MyService var2 = new MyService();
      Object var3 = var2.getSystemService("location");
      LocationManager var4 = (LocationManager)var3;
      Object var1 = EasyMock.createMock(Callback.class);
      var4.registerGnssStatusCallback((Callback)var1);
   }
}
