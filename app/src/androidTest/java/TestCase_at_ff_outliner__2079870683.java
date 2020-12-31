import android.accounts.Account;
import android.os.Parcel;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_at_ff_outliner__2079870683 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Account.class);
      Object var1 = EasyMock.createMock(Parcel.class);
      ((Account)var2).writeToParcel((Parcel)var1, 0);
   }
}
