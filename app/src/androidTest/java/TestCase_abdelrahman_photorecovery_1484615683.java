import android.os.Bundle;
import android.os.Parcel;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery_1484615683 {
   @Test
   public void testCase() throws Exception {
      Bundle var2 = new Bundle();
      Object var1 = EasyMock.createMock(Parcel.class);
      var2.writeToParcel((Parcel)var1, 0);
   }
}
