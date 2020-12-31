import android.os.Message;
import android.os.Parcel;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_33020A2A591B70BEE7C7B4E0B6FAD20180D9C0D2A85BEA325B925C9979BA34F9__1797035518 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Object[].class);
      var2 = ((Object[])var2)[0];
      Message var3 = (Message)var2;
      Object var1 = EasyMock.createMock(Parcel.class);
      var3.writeToParcel((Parcel)var1, 0);
   }
}
