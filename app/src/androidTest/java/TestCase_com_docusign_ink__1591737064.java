import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_docusign_ink__1591737064 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(LoaderCallbacks.class);
      Object var1 = EasyMock.createMock(Loader.class);
      ((LoaderCallbacks)var2).onLoaderReset((Loader)var1);
   }
}
