import android.os.Parcel;
import android.os.Parcelable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5985C883B36A2EA719E79A6E8EF210CC81933B98304689A9C22E23BBD4FDB3E0__1258865239 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Parcel.class);
      Object var1 = null;
      byte var2 = 1;
      ((Parcel)var3).writeParcelable((Parcelable)var1, var2);
   }
}
