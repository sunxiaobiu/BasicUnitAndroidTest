import android.app.Service;
import androidx.test.runner.AndroidJUnit4;
import java.lang.ref.WeakReference;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aplabs_whatson_1964322057 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Service.class);
      WeakReference var1 = new WeakReference(var2);
      var2 = var1.get();
      Service var3 = (Service)var2;
      byte var4 = 1;
      var3.stopSelf(var4);
   }
}
