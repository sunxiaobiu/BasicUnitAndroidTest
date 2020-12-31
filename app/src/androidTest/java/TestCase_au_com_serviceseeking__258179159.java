import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.AdapterDataObserver;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_serviceseeking__258179159 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Adapter.class);
      Object var1 = EasyMock.createMock(AdapterDataObserver.class);
      ((Adapter)var2).registerAdapterDataObserver((AdapterDataObserver)var1);
   }
}
