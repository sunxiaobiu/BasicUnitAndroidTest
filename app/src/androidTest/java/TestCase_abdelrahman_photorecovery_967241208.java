import android.os.Bundle;
import android.os.Parcel;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery_967241208 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Parcel.class);
      Object var1 = EasyMock.createMock(Bundle.class);
      ((Parcel)var2).writeBundle((Bundle)var1);
   }
}
