import android.os.Parcel;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_allhomes_1496722209 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Parcel.class);
      Object var1 = null;
      ((Parcel)var2).writeTypedList((List)var1);
   }
}
