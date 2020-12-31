import android.location.Location;
import android.os.Parcel;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_014117FE8FF081C26E42C43B5EAEA0246CE8A15FDE0BED5DD61231948A8E2EF6__107371880 {
   @Test
   public void testCase() throws Exception {
      Parcel var2 = Parcel.obtain();
      Object var1 = EasyMock.createMock(Location.class);
      var2.writeValue(var1);
   }
}
