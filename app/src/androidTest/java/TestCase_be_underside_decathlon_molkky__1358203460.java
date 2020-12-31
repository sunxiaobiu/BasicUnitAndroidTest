import android.content.Context;
import android.location.Criteria;
import android.location.LocationManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_be_underside_decathlon_molkky__1358203460 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("location");
      LocationManager var4 = (LocationManager)var3;
      Object var1 = EasyMock.createMock(Criteria.class);
      var4.getProviders((Criteria)var1, true);
   }
}
