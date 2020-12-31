import android.os.Parcel;
import android.os.Parcelable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery__819368424 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Parcelable.class);
      Object var1 = EasyMock.createMock(Parcel.class);
      byte var2 = 1;
      ((Parcelable)var3).writeToParcel((Parcel)var1, var2);
   }
}
