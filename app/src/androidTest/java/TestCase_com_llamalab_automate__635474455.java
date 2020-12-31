import android.content.ComponentName;
import android.content.ServiceConnection;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_llamalab_automate__635474455 {
   @Test
   public void testCase() throws Exception {
      CopyOnWriteArraySet var2 = new CopyOnWriteArraySet();
      Iterator var3 = var2.iterator();
      Object var4 = var3.next();
      ServiceConnection var5 = (ServiceConnection)var4;
      Object var1 = EasyMock.createMock(ComponentName.class);
      var5.onServiceDisconnected((ComponentName)var1);
   }
}
