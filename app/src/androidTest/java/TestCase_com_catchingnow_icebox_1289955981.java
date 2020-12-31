import android.os.Parcel;
import android.os.ResultReceiver;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_catchingnow_icebox_1289955981 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ResultReceiver.class);
      Object var1 = EasyMock.createMock(Parcel.class);
      ((ResultReceiver)var2).writeToParcel((Parcel)var1, 0);
   }
}
