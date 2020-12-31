import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_serviceseeking__1325009517 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(FragmentActivity.class);
      LoaderManager var2 = ((FragmentActivity)var1).getSupportLoaderManager();
   }
}
