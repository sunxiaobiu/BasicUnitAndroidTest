import android.app.LoaderManager;
import android.content.Loader;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_fsck_k9_650637238 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(LoaderManager.class);
      Loader var2 = ((LoaderManager)var1).getLoader(2);
   }
}
