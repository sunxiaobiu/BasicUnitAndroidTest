import android.database.ContentObservable;
import android.database.ContentObserver;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_infraware_polarisoffice_entbiz_gd_388526040 {
   @Test
   public void testCase() throws Exception {
      ContentObservable var2 = new ContentObservable();
      Object var1 = EasyMock.createMock(ContentObserver.class);
      var2.registerObserver((ContentObserver)var1);
   }
}
