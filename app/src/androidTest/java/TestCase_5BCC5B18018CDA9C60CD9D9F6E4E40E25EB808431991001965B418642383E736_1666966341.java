import android.location.Location;
import android.os.Parcel;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5BCC5B18018CDA9C60CD9D9F6E4E40E25EB808431991001965B418642383E736_1666966341 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Location.class);
      Object var1 = EasyMock.createMock(Parcel.class);
      ((Location)var2).writeToParcel((Parcel)var1, 0);
   }
}
