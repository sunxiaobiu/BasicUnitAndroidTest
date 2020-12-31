import android.os.Parcel;
import androidx.test.runner.AndroidJUnit4;
import java.io.Serializable;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_corrigo_enterprise__1980878071 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Parcel.class);
      Serializable var2 = ((Parcel)var1).readSerializable();
   }
}
