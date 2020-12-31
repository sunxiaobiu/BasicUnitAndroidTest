import android.bluetooth.le.AdvertiseData.Builder;
import android.os.ParcelUuid;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5AD69E4343350B20C32A318AFACD16A10D94CF07C521AE7F523F8F157C93C009_1972437216 {
   @Test
   public void testCase() throws Exception {
      Builder var2 = new Builder();
      Object var1 = EasyMock.createMock(ParcelUuid.class);
      var2.addServiceUuid((ParcelUuid)var1);
   }
}
