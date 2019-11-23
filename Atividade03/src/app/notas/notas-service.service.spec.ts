import { TestBed } from '@angular/core/testing';

import { NotasServiceService } from './notas-service.service';

describe('NotasServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: NotasServiceService = TestBed.get(NotasServiceService);
    expect(service).toBeTruthy();
  });
});
