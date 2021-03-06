package nl.knaw.huc.di.nde;

import com.google.common.collect.Lists;

import java.net.URI;
import java.util.List;

public class TermDTO {
  public URI uri;
  public List<String> prefLabel = Lists.newArrayList();
  public List<String> altLabel = Lists.newArrayList();
  public List<String> hiddenLabel = Lists.newArrayList();
  public List<String> scopeNote = Lists.newArrayList();
  public List<String> definition = Lists.newArrayList();
  public List<RefDTO> broader = Lists.newArrayList();
  public List<RefDTO> narrower = Lists.newArrayList();
  public List<RefDTO> related = Lists.newArrayList();
}
